#!/usr/bin/env bash
# run this bash script inside bin directory

set -euo pipefail
which psql > /dev/null || { echo "Please ensure that postgres client is in your PATH" ; echo "$*" >&2; exit 1; }

docker stop pg-docker || { echo "No docker conatainer named pg-docker is running " ; }


mkdir -p $HOME/docker/volumes/postgres
rm -rf $HOME/docker/volumes/postgres/data

docker run --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=dev -d -p 5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql postgres
#$ docker run -d --name my_postgres -v my_dbdata:/var/lib/postgresql/data -p 54320:5432 postgres:11
sleep 3
export PGPASSWORD=postgres
#psql -U postgres -d dev -h localhost -f schema.sql
#psql -U postgres -d dev -h localhost -f data.sql
docker cp ./schema.sql  pg-docker:/var/lib/postgresql/schema.sql
docker cp ./data.sql  pg-docker:/var/lib/postgresql/data.sql
docker exec -it pg-docker  psql -U postgres -d dev  -f /var/lib/postgresql/schema.sql
docker exec -it pg-docker  psql -U postgres -d dev  -f /var/lib/postgresql/data.sql
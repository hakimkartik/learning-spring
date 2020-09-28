package com.kartik.lil.learningspring;

import com.kartik.lil.learningspring.data.entity.Guest;
import com.kartik.lil.learningspring.data.entity.Reservation;
import com.kartik.lil.learningspring.data.entity.Room;
import com.kartik.lil.learningspring.data.repository.GuestRepository;
import com.kartik.lil.learningspring.data.repository.ReservationRepository;
import com.kartik.lil.learningspring.data.repository.RoomRepository;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }

    /*
    @RestController
    @RequestMapping("/rooms")
    public static class RoomController {
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        public Iterable<Room> getRooms() {
			System.out.println("Going to get rooms info ");
            return this.roomRepository.findAll();
        }

    }


    @RestController
    @RequestMapping("/guests")
    public static class GuestController {
        @Autowired
        private GuestRepository guestRepository;

        @GetMapping
        public Iterable<Guest> getGuests() {
			System.out.println("Going to get guests info ");
            return this.guestRepository.findAll();
        }

    }


    @RestController
    @RequestMapping("/reservations")
    public static class ReservationController {
        @Autowired
        private ReservationRepository reservationRepository;

        @GetMapping
        public Iterable<Reservation> getReservations() {
			System.out.println("Going to get reservation info ");
            return this.reservationRepository.findAll();
        }

    }
*/
}


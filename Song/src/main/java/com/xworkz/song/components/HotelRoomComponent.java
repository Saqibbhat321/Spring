package com.xworkz.song.components;

import com.xworkz.song.DTO.HotelRoom;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class HotelRoomComponent {

    public HotelRoomComponent()
    {
        System.out.println();
        System.out.println("Created HotelComponent");
    }

    @RequestMapping("/book")
    public String onPress(HotelRoom hotelRoom)
    {
        System.out.println("onPressCreated");
        System.out.println("HotelRoom: "+hotelRoom);
        return "HotelRoom.jsp";
    }

}

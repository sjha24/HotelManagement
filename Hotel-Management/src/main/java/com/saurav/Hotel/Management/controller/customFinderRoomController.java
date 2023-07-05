package com.saurav.Hotel.Management.controller;

import com.saurav.Hotel.Management.model.HotelRoom;
import com.saurav.Hotel.Management.model.Type;
import com.saurav.Hotel.Management.service.CFRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CF")
public class customFinderRoomController {
    @Autowired
    CFRoomService cfRoomService;
    @GetMapping("/rooms/{roomStatus}")
    public List<HotelRoom>findByRoomStatus(@PathVariable Boolean roomStatus){
        return cfRoomService.findByRoomStatus(roomStatus);
    }
    @GetMapping("/rooms/{roomStatus}/{roomType}")
    public List<HotelRoom>findByRoomStatusAndRoomType(@PathVariable Boolean roomStatus, @PathVariable Type roomType){
        return cfRoomService.findByRoomStatusAndRoomType(roomStatus,roomType);
    }
    @GetMapping("/rooms/roomPrice/{roomPrice}/roomStatus/{roomStatus}")
    public List<HotelRoom>findByRoomPriceLessThanAndRoomStatus(@PathVariable Double roomPrice, @PathVariable Boolean roomStatus){
        return cfRoomService.findByRoomPriceLessThanAndRoomStatus(roomPrice,roomStatus);
    }
    @GetMapping("/rooms/roomType/{roomType}/priceRange")
    public List<HotelRoom>findByRoomTypeAndRoomPriceGreaterThanEqualAndRoomPriceLessThanEqual(@PathVariable Type roomType, @RequestParam Double LessPrice, @RequestParam Double GreaterPrice){
        return cfRoomService.findByRoomTypeAndRoomPriceGreaterThanEqualAndRoomPriceLessThanEqual(roomType,LessPrice,GreaterPrice);
    }
    @GetMapping("/rooms/roomType/{roomType}/orderBy")
    public List<HotelRoom>findByRoomTypeAndOrderByRoomPriceDesc(@PathVariable Type roomType){
        return cfRoomService.findByRoomTypeAndOrderByRoomPriceDesc(roomType);
    }
}
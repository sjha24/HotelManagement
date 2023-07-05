package com.saurav.Hotel.Management.controller;

import com.saurav.Hotel.Management.model.HotelRoom;
import com.saurav.Hotel.Management.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    //get
    @GetMapping("rooms")
    public List<HotelRoom> getAllRooms()
    {
        return roomService.getAllRooms();

    }
    @GetMapping("rooms/Id/{ID}")
    public Optional<HotelRoom> getRoomById(@PathVariable Integer ID){
        return roomService.getRoomById(ID);
    }
    //post
    @PostMapping("rooms")
    public String addRooms(@RequestBody List<HotelRoom> rooms){
        return roomService.addRooms(rooms);
    }
    @PostMapping("room")
    public String addRoom(@RequestBody HotelRoom room){
        return roomService.addRoom(room);
    }
    //update
    @PutMapping("room/Id/{ID}")
    public String updateRoomById(@PathVariable Integer ID, @RequestBody HotelRoom rooms){
        return roomService.updateRoomById(ID,rooms);
    }
}

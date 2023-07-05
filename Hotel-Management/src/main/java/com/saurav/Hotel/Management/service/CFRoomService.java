package com.saurav.Hotel.Management.service;

import com.saurav.Hotel.Management.model.HotelRoom;
import com.saurav.Hotel.Management.model.Type;
import com.saurav.Hotel.Management.repository.I_RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CFRoomService {
    @Autowired
    I_RoomRepo roomRepo;
    public List<HotelRoom> findByRoomStatus(Boolean roomStatus) {
        return roomRepo.findByRoomStatus(roomStatus);
    }

    public List<HotelRoom> findByRoomStatusAndRoomType(Boolean roomStatus, Type roomType) {
        return roomRepo.findByRoomStatusAndRoomType(roomStatus,roomType);
    }

    public List<HotelRoom> findByRoomPriceLessThanAndRoomStatus(Double roomPrice, Boolean roomStatus) {
        return roomRepo.findByRoomPriceLessThanAndRoomStatus(roomPrice,roomStatus);
    }

    public List<HotelRoom> findByRoomTypeAndRoomPriceGreaterThanEqualAndRoomPriceLessThanEqual(Type roomType, Double lowerLimitPrice, Double upperLimitPrice) {
        return roomRepo.findByRoomTypeAndRoomPriceGreaterThanEqualAndRoomPriceLessThanEqual(roomType,lowerLimitPrice,upperLimitPrice);
    }

    public List<HotelRoom> findByRoomTypeAndOrderByRoomPriceDesc(Type roomType) {
        return roomRepo.findByRoomTypeOrderByRoomPriceDesc(roomType);
    }
}

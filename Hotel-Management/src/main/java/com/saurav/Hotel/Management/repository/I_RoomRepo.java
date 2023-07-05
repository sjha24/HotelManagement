package com.saurav.Hotel.Management.repository;

import com.saurav.Hotel.Management.model.HotelRoom;
import com.saurav.Hotel.Management.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface I_RoomRepo extends CrudRepository<HotelRoom,Integer> {
    //custom finder---------------------------------->
    List<HotelRoom> findByRoomStatus(Boolean roomStatus);
    List<HotelRoom>findByRoomStatusAndRoomType(Boolean roomStatus, Type roomType);
    List<HotelRoom>findByRoomPriceLessThanAndRoomStatus(Double roomPrice,Boolean roomStatus);
    List<HotelRoom>findByRoomTypeAndRoomPriceGreaterThanEqualAndRoomPriceLessThanEqual(Type roomType,Double GreaterPrice,Double LessPrice);
    List<HotelRoom>findByRoomTypeOrderByRoomPriceDesc(Type roomType);
}

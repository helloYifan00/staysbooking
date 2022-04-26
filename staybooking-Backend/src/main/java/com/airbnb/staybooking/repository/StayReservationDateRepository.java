package com.airbnb.staybooking.repository;

import com.airbnb.staybooking.model.StayReservedDate;
import com.airbnb.staybooking.model.StayReservedDateKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface StayReservationDateRepository extends JpaRepository<StayReservedDate, StayReservedDateKey> {
    @Query(value = "SELECT sa.id.stay_id FROM StayReservedDate sa WHERE sa.id.stay_id IN ?1 AND sa.id.date BETWEEN ?2 AND ?3 GROUP BY sa.id.stay_id")
    Set<Long> findByIdInAndDateBetween(List<Long> stayIds, LocalDate startDate, LocalDate endDate);
}

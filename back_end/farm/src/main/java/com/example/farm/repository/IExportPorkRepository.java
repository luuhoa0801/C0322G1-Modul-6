package com.example.farm.repository;

import com.example.farm.model.ExportPork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExportPorkRepository extends JpaRepository<ExportPork,Integer> {
    @Modifying
    @Query(value = "insert into export_port (code_cage,code_employee,name_employee,company,start_day,amount,kilogram," +
            "price,type_pigs,is_delete) values" +
            " (:codeCage,:codeEmployee,:nameEmployee,:company,:startDay,:amount,:kilogram,:price,:typePigs,:isDelete)", nativeQuery = true)
    void create(@Param("codeCage") String codeCage,
                @Param("codeEmployee") String codeEmployee,
                @Param("nameEmployee") String nameEmployee,
                @Param("company") String company,
                @Param("startDay") String startDay,
                @Param("amount") String amount,
                @Param("kilogram") String kilogram,
                @Param("price") String price,
                @Param("typePigs") String typePigs,
                @Param("isDelete") String isDelete
                );

    @Modifying
    @Query(value = "update export_port set code_cage = :codeCage,code_employee = :codeEmployee,name_employee = :nameEmployee,company = :company," +
            "start_day = :startDay,amount = :amount,kilogram = :kilogram,price = :price,type_pigs = :typePigs,is_delete = :isDelete, where id = :id",
            nativeQuery = true)
    void update(@Param("codeCage") String codeCage, @Param("codeEmployee") String codeEmployee,
                @Param("nameEmployee") String nameEmployee, @Param("company") String company,
                @Param("startDay") String startDay, @Param("amount") String amount,
                @Param("kilogram") String kilogram,@Param("price") String price,
                @Param("typePigs") String typePigs,@Param("isDelete") String isDelete,
                @Param("id") Integer id
    );
}

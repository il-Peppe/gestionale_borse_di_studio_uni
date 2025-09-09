package com.example.demo.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TipologiaBorsa;

@Repository
public interface TipologiaBorseRepository extends JpaRepository<TipologiaBorsa, Integer>{
	
	@Query("""
		    SELECT t FROM TipologiaBorsa t
		    WHERE 
		    (:id IS NULL OR t.id = :id)
			    AND (:nomeTipologia IS NULL OR LOWER(t.nomeTipologia) LIKE LOWER(CONCAT('%', :nomeTipologia, '%')))
				""")
	Page<TipologiaBorsa> 
	searchByParam(@Param("id") Integer id,@Param("nomeTipologia") String nomeTipologia,  Pageable pageable);

}
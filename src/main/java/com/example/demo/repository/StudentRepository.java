//student respoitory

package com.example.demo.resository;

import org.springframework.data.jpa.respository.JpaRepository;
import com.example.demo.entity.Stuentity;
public interface StudentRepository extends JpaRepository<Stuentity,Long>{
}



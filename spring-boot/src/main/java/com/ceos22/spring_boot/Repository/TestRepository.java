package com.ceos22.spring_boot.Repository;

import com.ceos22.spring_boot.Domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {}

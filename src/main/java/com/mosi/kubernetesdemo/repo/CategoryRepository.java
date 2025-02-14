package com.mosi.kubernetesdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<com.mosi.kubernetesdemo.model.Category, Long> {
}
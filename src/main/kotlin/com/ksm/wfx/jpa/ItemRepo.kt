package com.ksm.wfx.jpa

import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository

@Repository
interface ItemRepo : CrudRepository<Item, Long> 
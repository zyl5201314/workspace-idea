/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: StuJpa
 * Author:   zyl
 * Date:     2020/8/14 10:14
 * History:
 */
package com.ytc.dao;

import com.ytc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/14
 * @since 1.0.0
 */
public interface StuJpa extends JpaRepository<Student,Integer> {


}

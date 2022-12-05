package com.expense.expensemanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.sql.Date;

@Entity
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonalExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String expenseReason;
    private float expenseAmount;
    private float expenseVat;
    private Date expenseDate;
}

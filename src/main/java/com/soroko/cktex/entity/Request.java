package com.soroko.cktex.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author yuriy.soroko
 */
@Getter
@Setter
@Entity
@Table(name = "sk_example_table")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Example {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Positive
    @NotNull
    int current;
}

package com.devsuperior.dsdesafios.dsdesafio1mod3.mappers;

import java.util.List;

public interface BeanMapper<E, D> {

    D toDTO(E e);

    E toEntity(D d);

    List<D> toDTO(List<E> es);

    List<E> toEntity(List<D> ds);

}

package com.alfredtech.ecormerceapplication.repository.shoeRepository;

import com.alfredtech.ecormerceapplication.model.Shoe;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Component

public class ShoeRepositoryImplementation implements ShoeRepository{
    @Override
    public void flush() {

    }

    @Override
    public <S extends Shoe> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Shoe> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Shoe> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Shoe getOne(Long aLong) {
        return null;
    }

    @Override
    public Shoe getById(Long aLong) {
        return null;
    }

    @Override
    public Shoe getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Shoe> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Shoe> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Shoe> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Shoe> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Shoe> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Shoe> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Shoe, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Shoe> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Shoe> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Shoe> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Shoe> findAll() {
        return null;
    }

    @Override
    public List<Shoe> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Shoe entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Shoe> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Shoe> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Shoe> findAll(Pageable pageable) {
        return null;
    }
}

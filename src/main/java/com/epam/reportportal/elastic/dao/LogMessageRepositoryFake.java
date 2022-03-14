package com.epam.reportportal.elastic.dao;

import com.epam.reportportal.log.LogMessage;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Fake repository, need in case if configuration for elastic with logs doesn't exist.
 */
@Repository
@ConditionalOnMissingBean(name = "logMessageRepository")
@SuppressFBWarnings("NP_NONNULL_RETURN_VIOLATION")
public class LogMessageRepositoryFake implements LogMessageRepository {
    @Override
    public <S extends LogMessage> S indexWithoutRefresh(S entity) {
        return null;
    }

    @Override
    public Iterable<LogMessage> search(QueryBuilder query) {
        return null;
    }

    @Override
    public Page<LogMessage> search(QueryBuilder query, Pageable pageable) {
        return null;
    }

    @Override
    public Page<LogMessage> search(Query searchQuery) {
        return null;
    }

    @Override
    public Page<LogMessage> searchSimilar(LogMessage entity, String[] fields, Pageable pageable) {
        return null;
    }

    @Override
    public void refresh() {

    }

    @Override
    public Iterable<LogMessage> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LogMessage> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LogMessage> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LogMessage> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LogMessage> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<LogMessage> findAll() {
        return null;
    }

    @Override
    public Iterable<LogMessage> findAllById(Iterable<Long> longs) {
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
    public void delete(LogMessage entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends LogMessage> entities) {

    }

    @Override
    public void deleteAll() {

    }
}

package co.jp.yuki.koike.sample.domain.repository.user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import co.jp.yuki.koike.sample.domain.model.User;

public class UserRepositoryImpl implements  UserRepository {

    @Override
    public List<User> findAll() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public List<User> findAll(Sort sort) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public List<User> findAllById(Iterable<String> ids) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void flush() {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<User> entities) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void deleteAllInBatch() {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public User getOne(String id) {
        // TODO 自動生成されたメソッド・スタブ
        return ;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public <S extends User> Optional<S> findOne(Example<S> example) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public <S extends User> long count(Example<S> example) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public <S extends User> boolean exists(Example<S> example) {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public <S extends User> S save(S entity) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Optional<User> findById(String id) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public boolean existsById(String id) {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public long count() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public void deleteById(String id) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void delete(User entity) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void deleteAll() {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public int hashCode() {
        // TODO 自動生成されたメソッド・スタブ
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO 自動生成されたメソッド・スタブ
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO 自動生成されたメソッド・スタブ
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO 自動生成されたメソッド・スタブ
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO 自動生成されたメソッド・スタブ
        super.finalize();
    }


}

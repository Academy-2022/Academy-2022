package mk.iwec.bokshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mk.iwec.bokshelf.domain.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}

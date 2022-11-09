package google.drive.psk.domain;

import google.drive.psk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="videos", path="videos")
public interface VideoRepository extends PagingAndSortingRepository<Video, Long>{

}

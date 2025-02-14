package google.drive.psk.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="Dashboard_table")
@Data
public class Dashboard {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String name;
        private String type;
        private String size;
        private Boolean isIndexed;
        private Boolean isUploaded;
        private String videoUrl;


}
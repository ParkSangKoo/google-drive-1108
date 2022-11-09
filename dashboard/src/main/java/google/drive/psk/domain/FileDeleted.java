package google.drive.psk.domain;

import google.drive.psk.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class FileDeleted extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
}

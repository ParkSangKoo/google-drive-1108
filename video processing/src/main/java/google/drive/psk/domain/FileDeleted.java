package google.drive.psk.domain;

import google.drive.psk.domain.*;
import google.drive.psk.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileDeleted extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
}



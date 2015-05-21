package ch.unige.idsi15;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Marker {

    /**
     */
    private String qrCodeId;

    /**
     */
    private Double longitude;

    /**
     */
    private Double latitude;

    /**
     */
    private String description;
}

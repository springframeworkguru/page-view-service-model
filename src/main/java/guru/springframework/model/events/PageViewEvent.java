package guru.springframework.model.events;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by jt on 2/22/17.
 */
@XmlRootElement
public class PageViewEvent {

    @XmlElement
    private String pageUrl;

    @XmlElement
    private String id;

    @XmlElement
    private Date pageViewDate;

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPageViewDate() {
        return pageViewDate;
    }

    public void setPageViewDate(Date pageViewDate) {
        this.pageViewDate = pageViewDate;
    }
}

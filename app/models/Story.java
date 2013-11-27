package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: shekhargulati
 * Date: 27/11/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Story extends Model{

    @Id
    private String id;

    private String url;

    private String fullname;

    private Date submittedOn = new Date();

    private String title;
    private String text;
    private String image;


    public Story() {

    }

    public Story(String url, String fullname) {
        this.url = url;
        this.fullname = fullname;
    }

    public Story(String url, String fullname, String image, String text, String title) {
        this.url = url;
        this.fullname = fullname;
        this.title = title;
        this.text = text;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(Date submittedOn) {
        this.submittedOn = submittedOn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

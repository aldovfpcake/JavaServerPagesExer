package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
    
    @Column(name="id")
    @Id
    private String slug;
    private String title;
    private String body;
    public Post(){};
    @Override
    public String toString() {
        return "Post{" + "slug=" + slug + ", title=" + title + ", body=" + body + '}';
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
	
	
}
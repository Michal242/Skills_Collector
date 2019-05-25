package pl.michal242.model.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "sources")
public class Source {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String description;
    private String name;

    @ManyToMany
    @JoinTable(name = "sources_attached_skills",
            joinColumns = @JoinColumn(name = "source_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<Skill> attachedSkills;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return id == source.id &&
                Objects.equals(description, source.description) &&
                Objects.equals(name, source.name) &&
                Objects.equals(attachedSkills, source.attachedSkills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Source{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}




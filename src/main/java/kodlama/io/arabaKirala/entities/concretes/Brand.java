package kodlama.io.arabaKirala.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private String name;
    @Column(name="name")
    private int id;
}

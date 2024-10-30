package br.edu.ifpb.pweb2.projeto.lensconnect.model;

import br.edu.ifpb.pweb2.projeto.lensconnect.model.Photo;
import br.edu.ifpb.pweb2.projeto.lensconnect.model.Photographer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commentText;

    private LocalDateTime createAt;

    @ManyToOne
    @JoinColumn(name = "photo_id")
    private Photo photo;


    @ManyToOne
    @JoinColumn(name = "photographer_id")
    private Photographer photographer;


}
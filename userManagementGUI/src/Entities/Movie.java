/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Armand Riviere
 */
@Entity
@Table(name = "movie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
    @NamedQuery(name = "Movie.findByMovieId", query = "SELECT m FROM Movie m WHERE m.movieId = :movieId"),
    @NamedQuery(name = "Movie.findByMovieName", query = "SELECT m FROM Movie m WHERE m.movieName = :movieName"),
    @NamedQuery(name = "Movie.findByMovieDirector", query = "SELECT m FROM Movie m WHERE m.movieDirector = :movieDirector"),
    @NamedQuery(name = "Movie.findByMovieProducer", query = "SELECT m FROM Movie m WHERE m.movieProducer = :movieProducer"),
    @NamedQuery(name = "Movie.findByMovieClassification", query = "SELECT m FROM Movie m WHERE m.movieClassification = :movieClassification"),
    @NamedQuery(name = "Movie.findByMovieGenre", query = "SELECT m FROM Movie m WHERE m.movieGenre = :movieGenre"),
    @NamedQuery(name = "Movie.findByMovieDuration", query = "SELECT m FROM Movie m WHERE m.movieDuration = :movieDuration"),
    @NamedQuery(name = "Movie.findByMovieStatus", query = "SELECT m FROM Movie m WHERE m.movieStatus = :movieStatus")})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "movieId")
    private Integer movieId;
    @Basic(optional = false)
    @Column(name = "movieName")
    private String movieName;
    @Basic(optional = false)
    @Column(name = "movieDirector")
    private String movieDirector;
    @Basic(optional = false)
    @Column(name = "movieProducer")
    private String movieProducer;
    @Basic(optional = false)
    @Column(name = "movieClassification")
    private String movieClassification;
    @Basic(optional = false)
    @Column(name = "movieGenre")
    private String movieGenre;
    @Basic(optional = false)
    @Column(name = "movieDuration")
    private int movieDuration;
    @Basic(optional = false)
    @Column(name = "movieStatus")
    private boolean movieStatus;

    public Movie() {
    }

    public Movie(Integer movieId) {
        this.movieId = movieId;
    }

    public Movie(String movieName, String movieDirector, String movieProducer, String movieClassification, String movieGenre, int movieDuration, boolean movieStatus) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieProducer = movieProducer;
        this.movieClassification = movieClassification;
        this.movieGenre = movieGenre;
        this.movieDuration = movieDuration;
        this.movieStatus = movieStatus;
    }
    
    public Movie(Integer movieId, String movieName, String movieDirector, String movieProducer, String movieClassification, String movieGenre, int movieDuration, boolean movieStatus) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieProducer = movieProducer;
        this.movieClassification = movieClassification;
        this.movieGenre = movieGenre;
        this.movieDuration = movieDuration;
        this.movieStatus = movieStatus;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieProducer() {
        return movieProducer;
    }

    public void setMovieProducer(String movieProducer) {
        this.movieProducer = movieProducer;
    }

    public String getMovieClassification() {
        return movieClassification;
    }

    public void setMovieClassification(String movieClassification) {
        this.movieClassification = movieClassification;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public boolean getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(boolean movieStatus) {
        this.movieStatus = movieStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieId != null ? movieId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.movieId == null && other.movieId != null) || (this.movieId != null && !this.movieId.equals(other.movieId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Movie[ movieId=" + movieId + " ]";
    }
    
}

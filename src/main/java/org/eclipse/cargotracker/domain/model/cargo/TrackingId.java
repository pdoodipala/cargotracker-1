package org.eclipse.cargotracker.domain.model.cargo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.Validate;

/** Uniquely identifies a particular cargo. Automatically generated by the application. */
@Embeddable
public class TrackingId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "tracking_id", unique = true, updatable = false)
    private String id;

    public TrackingId() {}

    public TrackingId(String id) {
        Validate.notNull(id);
        this.id = id;
    }

    public String getIdString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TrackingId other = (TrackingId) o;

        return sameValueAs(other);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    boolean sameValueAs(TrackingId other) {
        return other != null && this.id.equals(other.id);
    }

    @Override
    public String toString() {
        return id;
    }
}

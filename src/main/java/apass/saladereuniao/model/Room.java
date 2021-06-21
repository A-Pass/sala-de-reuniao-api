package apass.saladereuniao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	private String name;

	@NotBlank
	private String date;

	@NotBlank
	private String startHour;

	@NotBlank
	private String endHour;

	@Override
	public String toString() {
		return String.format("Rom [id=%s, name=%s, startHour=%s, endHour=%s]", this.id, this.name, this.startHour,
				this.endHour);
	}
}

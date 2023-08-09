/***************************************************************************
 * File:  PojoListener.java Course materials (23S) CST 8277
 *
 * @author Teddy Yap
 * @author Shariar (Shawn) Emami
 * @author (original) Mike Norman
 *
 * Updated by:  Group 04
 *   041056432, Tanzim Ahmed, Sagar
 *   041047759, Fabrizio, Ruggirello
 *   040650709, Najma, Abdullahi
 *   studentId, firstName, lastName (as from ACSIS)
 *
 */
package acmecollege.entity;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@SuppressWarnings("unused")

public class PojoListener {

	@PrePersist
	public void setCreatedOnDate(PojoBase pojoBase) {
		LocalDateTime now = LocalDateTime.now();
		pojoBase.setCreated(now);
		pojoBase.setUpdated(now);
	}

	@PreUpdate
	public void setUpdatedDate(PojoBase pojoBase) {
		pojoBase.setUpdated(LocalDateTime.now());
	}

}

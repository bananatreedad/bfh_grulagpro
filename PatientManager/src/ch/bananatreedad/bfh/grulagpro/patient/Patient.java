/*
 * 
 */
package ch.bananatreedad.bfh.grulagpro.patient;

import java.util.ArrayList;

import ch.bananatreedad.grulagpro.address.address.Address;
import ch.bfh.PatientCase;

/**
 * This class figures a patient.
 * 
 * @author bananatreedad
 *
 */
public class Patient {

    private long pin;
    private String firstName;
    private String name;
    private String dateOfBirth;
    private char gender;
    private Address address;
    private ArrayList<PatientCase> caseList;
    
    /**
     * Constructs a Patient with the given parameters as properties. <br>
     * 
     * @param aPIN
     *            - Patient Identification Number.
     * @param aFirstName
     *            - First name of a patient.
     *            - Name of a patient.
     * @param aDateOfBirth
     *            - Date of birth of a patient (Format: dd.mm.yyyy).
     * @param aGender
     *            - Gender of a patient.
     * @param anAddress
     *            - Address of a patient.
     */
    public Patient(long aPIN, String aFirstName, String aName,
	    String aDateOfBirth, char aGender, Address anAddress) {

	this.pin = aPIN;
	this.firstName = aFirstName;
	this.name = aName;
	this.dateOfBirth = aDateOfBirth;
	this.gender = aGender;
	this.address = anAddress;
    }

    /**
     * Returns the Address of this Patient.
     * 
     */
    public Address getAddress() {
	return this.address;
    }

    /**
     * 
     * @param aCaseID
     * @param anAdmReason
     * @param anAdmDate
     * @param aSize
     * @param aWeight
     */
    public void addCase(long aCaseID, String anAdmReason, String anAdmDate,
	    int aSize, int aWeight) {

	PatientCase newCase = new PatientCase(aCaseID, anAdmReason, anAdmDate,
		aSize, aWeight, anAdmReason, this.gender);

	caseList.add(newCase);
     */
    public PatientCase getCase(int aCaseID) {
	for (PatientCase patientCase : caseList) {
	    if (patientCase.getCaseID() == aCaseID)
		return patientCase;
	}
	return null;
    }

    /**
     * Returns the date of birth of this Patient. <br>
     * 
     * @return
     */
    public String getDateOfBirth() {
	return this.dateOfBirth;
    }

    /**
     * Returns the first name of this Patient. <br>
     * 
     */
    public String getFirstName() {
	return this.firstName;
    }

    /**
     * Returns the gender of this Patient. <br>
     * 
     */
    public char getGender() {
	return this.gender;
    }

    /**
     * Returns the name of this Patient. <br>
     * 
     */
    public String getName() {
	return this.firstName + " " + this.name;
    }

    /**
     * Returns the Patient Identification Number of this Patient. <br>
     */
    public long getPIN() {
	return this.pin;
    }

    /**
     * Sets the Address for this Patient. <br>
     * 
     * @param aStreet
     * @param aStreetNumber
     */
    public void setAddress(String aStreet, String aStreetNumber,
	    int aPostalCode, String aCity) {
	this.address = new Address(this.name, this.firstName, aStreet + " "
		+ aStreetNumber, aPostalCode, aCity,
		Address.Country.SWITZERLAND);
    }

    /**
     * Sets the date of the last menstrual period of this Patient. <br>
     * 
     * @param aCaseID
     * @param aDate
     */
    public void setDateOfLastMenstrualPeriod(int aCaseID, String aDate) {

    }

    /**
     * Sets the name of this Patient. <br>
     * 
     * @param aName
     * @param aFirstName
     */
    public void setName(String aName, String aFirstName 
    /**
     * had to add additional
     * param
     **/
    ) {
	this.name = aName;
	this.firstName = aFirstName;
    }

    /**
     * Returns the most important data of this Patient as a String
     * representation (PIN, first name, name, date of birth, gender, street,
     * street number, postal code, city). <br>
     * 
     * Example: <br>
     * <i>Patient Object:<br>
     * PIN: 4<br>
     * first name: Jonathan<br>
     * name: Meier<br>
     * date of birth: 16.04.1992<br>
     * gender: m<br>
     * street: Teststreet<br>
     * postal code: 8888<br>
     * city: Examplehausen
     */
    public String toString() {
	return ("Patient Object: \n" + "PIN:	\t\t" + this.pin + "\n"
		+ "first name: \t\t" + this.firstName + "\n" + "lastname: \t\t"
		+ this.name + "\n" + "date of birth: \t\t" + this.dateOfBirth
		+ "\n" + "gender: \t\t" + this.gender + "\n" + "street: \t\t"
		+ this.address.getStreet() + "\n" + "postal code:	\t"
		+ this.address.getPostalCode() + "\n" + "city: \t\t\t" + this.address
		    .getCity());
    }
}

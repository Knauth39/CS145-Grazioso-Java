// SNHU IT 145 Project Two
// Monkey.java
// Author: 2022 June 05 Mary Visser
	// 2022 June 05 - Created 
	// 2022 June 19 - Modified

public class Monkey extends RescueAnimal {
   private String tailLength;
   private String height;
   private String bodyLength;
   private String species;

   // Default constructor
   public Monkey(String name, String gender, String age,
   String weight, String acquisitionDate, String acquisitionCountry,
  String trainingStatus, boolean reserved, String inServiceCountry, 
  String tailLenth, String height, String bodyLength, String species) {
      setName(name);
      setGender(gender);
      setAge(age);
      setWeight(weight);
      setAcquisitionDate(acquisitionDate);
      setAcquisitionLocation(acquisitionCountry);
      setTrainingStatus(trainingStatus);
      setReserved(reserved);
      setInServiceCountry(inServiceCountry);
      setTailLength(tailLenth);
      setHeight(height);
      setBodyLength(bodyLength);
      setSpecies(species);
   }

   // Setters and Getters
   public String getTailLength() {
	   return tailLength;
   }

   public void setTailLength(String tailLength) {
	   this.tailLength = tailLength;
   }

   public String getHeight() {
	   return height;
   }

   public void setHeight(String height) {
	   this.height = height;
   }

   public String getBodyLength() {
	   return bodyLength;
   }

   public void setBodyLength(String bodyLength) {
	   this.bodyLength = bodyLength;
   }

   public String getSpecies() {
	   return species;
   }

   public void setSpecies(String species) {
	   this.species = species;
   }
}

   
   

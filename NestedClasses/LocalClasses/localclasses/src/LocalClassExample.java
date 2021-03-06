
//http://docs.oracle.com/javase/tutorial/java/javaOO/examples/LocalClassExample.java -->
/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

 /**
  * LocalClassExample
  * @author oralce
  * @version unknown
  */
public class LocalClassExample {

	static String regularExpression = "[^0-9]";

	/**
	  * static method to validate input phone numbers
	  * @param String phoneNumber1 input phone number 1
	  * @param String phoneNumber2 input phone number 2
	  * @return no return value
	  */
	public static void validatePhoneNumber(
		String phoneNumber1, String phoneNumber2) {

			// final due to its usage in the method of inner class PhoneNumber
			final int numberLength = 10;

			// Valid in Java SE 8 and later:

			// int numberLength = 10;

			// IMPORTANT: cannot add public/private modifier since it is static method
			/**
			  * TODO: not able to make javadoc???
			  * PhoneNumber
			  */
			final class PhoneNumber {

				String formattedPhoneNumber = null;

				/**
				  * Constructor
				  * @param String phoneNumberStr String of phone number
				  */
				private PhoneNumber(String phoneNumberStr) {
					// numberLength = 7;
					// remove all non-digital character 
					String currentNumber = phoneNumberStr.replaceAll(
							regularExpression, "");
					if (currentNumber.length() == numberLength)
						formattedPhoneNumber = currentNumber;
					else
						formattedPhoneNumber = null;
				}

				public String getNumber() {
					return formattedPhoneNumber;
				}

				// Valid in Java SE 8 and later:

				//           public void printOriginalNumbers() {
				//              System.out.println("Original numbers are " + phoneNumber1 +
				//                  " and " + phoneNumber2);
				//           }
			}

			PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
			PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

			// Valid in Java SE 8 and later:

			// myNumber1.printOriginalNumbers();

			// Disploy the result of validation
			if (myNumber1.getNumber() == null) 
				System.out.println("First number is invalid");
			else
				System.out.println("First number is " + myNumber1.getNumber());
			if (myNumber2.getNumber() == null)
				System.out.println("Second number is invalid");
			else
				System.out.println("Second number is " + myNumber2.getNumber()); 

	}

	// http://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html
	/** Main program */
	public static void main(String... args) {
		validatePhoneNumber("603-555-0123", "555-0123");
	}
}

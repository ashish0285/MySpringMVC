package com.ashish.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{

	/* (non-Javadoc)
	 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	 */
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(studentName.startsWith("Mr")||studentName.startsWith("Ms")){
			setValue(studentName);
		}
		else {
			studentName = "Mr. " + studentName;
			setValue(studentName);
		}
	}

}

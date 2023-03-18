package com.ShiftTracking.ShiftTracking.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTrackingsResponse {
	private String department;
	private String firstName;
	private String lastName;
	private String readTime;
	
}

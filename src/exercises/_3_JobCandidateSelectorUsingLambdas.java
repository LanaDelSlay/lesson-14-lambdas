package exercises;

import java.util.Collections;

public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args){

		// 1. Sort the candidates by salary requirements, low to high.
		Collections.sort(JobCandidate.jobCandidates, (JobCandidate jc1, JobCandidate jc2) -> jc1.getSalaryRequired() - jc2.getSalaryRequired());
		System.out.print("Sorted by salary: "+JobCandidate.jobCandidates);
		
		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class
		System.out.println();
		System.out.println();
		System.out.println();
		JobCandidate.jobCandidates.removeIf((JobCandidate person) -> !person.getTeacherName().contains("June"));
		System.out.println("Sorted By Teacher: "+JobCandidate.jobCandidates);
		
	}

	
}

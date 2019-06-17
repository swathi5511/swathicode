package org.cts.git;

public class Sample {
	public static class CorseDetails {

		public void javaCorse() {

			System.out.println(" java corse is started ");
		}

		public void oracleCorse() {

			System.out.println(" oracle corse is not started ");
			System.out.println("modified");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			CorseDetails cd = new CorseDetails();
			cd.javaCorse();
			cd.oracleCorse();
		}

	}
}

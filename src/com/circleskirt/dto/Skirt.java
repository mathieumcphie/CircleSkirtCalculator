package com.circleskirt.dto;

public class Skirt {

		private double skirtLength;
		private double waist;
		private double verticalAngle;
		private double innerRadius, outerRadius, arcAngle;
		
		public Skirt() {
			this.innerRadius = 0.0;
			this.outerRadius = 0.0;
			this.arcAngle = 0.0;
		}
		
		public void setSkirtLength(double skirtLength) {
			this.skirtLength = skirtLength;
		}

		public void setWaist(double waist) {
			this.waist = waist;
		}
		
		public void setVerticalAngle(double verticalAngle) {
			this.verticalAngle = verticalAngle;
		}
		
		public double getInnerRadius() {
			return innerRadius;
		}
		
		public double getOuterRadius() {
			return outerRadius;
		}
		
		public double getArcAngle() {
			return arcAngle;
		}
		
		// Perhaps this logic operation should be moved to a Service class
		public void calculateSkirt() {
			// --- MATHS HAPPENS HERE ---
			this.arcAngle = 360*Math.sin(this.verticalAngle*Math.PI/180);
			this.innerRadius = this.waist/(this.verticalAngle*Math.PI/180);
			this.outerRadius = this.innerRadius + this.skirtLength;
		}
		
}

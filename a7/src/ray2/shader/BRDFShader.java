package ray2.shader;

import ray2.IntersectionRecord;
import ray2.Ray;
import ray2.Scene;
import ray2.light.Light;
import ray2.light.LightSamplingRecord;
import egl.math.Color;
import egl.math.Colord;
import egl.math.Vector3d;

public abstract class BRDFShader extends Shader {

	/** The color of the diffuse reflection, if there is no texture. */
	protected final Colord diffuseColor = new Colord(Color.White);
	public void setDiffuseColor(Colord diffuseColor) { this.diffuseColor.set(diffuseColor); }

	/**
	 * Evaluate the BRDF for this material.
	 * @param L a unit vector toward the light
	 * @param V a unit vector toward the viewer
	 * @param N a unit surface normal
	 * @param kD the diffuse coefficient of the surface at the shading point.
	 * @param outColor the computed BRDF value.
	 */
	protected abstract void evalBRDF(Vector3d L, Vector3d V, Vector3d N,
			Colord kD, Colord outColor);

	public BRDFShader() {
		super();
	}


	/**
	 * Evaluate the intensity for a given intersection using the BRDF appropriate to
	 * the instance, implemented in the overridden evalBRDF method.
	 *
	 * @param outIntensity The color returned towards the source of the incoming ray.
	 * @param scene The scene in which the surface exists.
	 * @param ray The ray which intersected the surface.
	 * @param iRec The intersection record of where the ray intersected the surface.
	 * @param depth The recursion depth.
	 */
	@Override
	public void shade(Colord outIntensity, Scene scene, Ray ray, IntersectionRecord iRec,
			int depth) {
		// TODO#A7 Fill in this function.
		// 1) Loop through each light in the scene.
		// 2) Use Light.sample() to generate a direction toward the light.
		// 3) If the intersection point is shadowed, skip the calculation for the light.
		//	  See Shader.java for a useful shadowing function.
		// 4) Evaluate the BRDF using the abstract evalBRDF method.
		// 5) Compute the final color using the BRDF value and the information in the
		//    light sampling record.
		
	}

}
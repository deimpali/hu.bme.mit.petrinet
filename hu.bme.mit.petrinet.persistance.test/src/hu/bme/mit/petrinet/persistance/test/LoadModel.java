package hu.bme.mit.petrinet.persistance.test;


import hu.bme.mit.petrinet.model.petrinetmodel.Petrinet;
import hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage;
import hu.bme.mit.petrinet.model.petrinetmodel.Place;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class LoadModel {
	public static void main(String[] args) throws IOException {
		PetrinetmodelPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().
			put("petrinetmodel", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		
		// Get the resource
		Resource resource = resSet.getResource(
				URI.createURI("model/My.petrinetmodel"), true);
		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		
		Petrinet pn = (Petrinet) (resource.getContents().get(0));
		for(Place places: pn.getPlaces()) {
			System.out.println(places.getToken());
		}
		resource.save(Collections.EMPTY_MAP);
	}
}
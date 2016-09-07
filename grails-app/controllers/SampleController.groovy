import idcapture.model.SampleModel;

class SampleController {

	def test() {

		def samples = SampleModel.list();

		// samples=[] transients=[[state, otherTransientField]] 
		println "samples=" + samples + " transients=" + SampleModel.transients;
		// transients is a double list => otherTransientField is not generated

	}

}
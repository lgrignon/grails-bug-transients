package idcapture.model

import java.lang.reflect.Field

class SampleModel extends AbstractModel<Long> {
	
	static transients = AbstractModel.transients + ['otherTransientField']

	static mapping = {
		content type:'text'
	}
	
	static constraints = {
		content(nullable: false)
	}

	String content;
	String otherTransientField
}

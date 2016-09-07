package idcapture.model

import java.lang.reflect.Field

abstract class AbstractModel<ID> {
	
	static transients = ['state']

	static mapping = {
		uuid index:'idx_uuid'
		uuid defaultValue: null
	}
	
	static constraints = {
		uuid(nullable: true)
	}

	UUID uuid
	
	AbstractModel() {
		uuid = UUID.randomUUID();
	}

	boolean state
	long version
	
	@Override
	public int hashCode() {
		return getUuid().hashCode()
	}
	
	public boolean equals(Object other) {
		if (other != null && other.is(this)) {
			return true;
		}
		boolean sameModel = other != null && getClass().equals(other.getClass());
		return other != null && sameModel && ObjectUtils.equals(other.getUuid(), getUuid());
	}
}

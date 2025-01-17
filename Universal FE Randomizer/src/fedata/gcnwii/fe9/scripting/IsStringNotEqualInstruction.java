package fedata.gcnwii.fe9.scripting;

import io.gcn.GCNCMBFileHandler;

public class IsStringNotEqualInstruction extends ScriptInstruction {

	public IsStringNotEqualInstruction() {
		
	}
	
	@Override
	public String displayString() {
		return "IS_STRING_NOT_EQUAL";
	}

	@Override
	public byte[] rawBytes() {
		return new byte[] {0x36};
	}

	@Override
	public byte opcode() {
		return 0x36;
	}

	@Override
	public int numArgBytes() {
		return 0;
	}

	@Override
	public ScriptInstruction createWithArgs(byte[] args, GCNCMBFileHandler handler) {
		return new IsStringNotEqualInstruction();
	}

}

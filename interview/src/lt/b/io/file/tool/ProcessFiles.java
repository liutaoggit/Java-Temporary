package lt.b.io.file.tool;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * 策略模式 Strategy对搜素的结果进行处理
 * @author liutao
 *
 */
public class ProcessFiles {
	public interface Strategy{
		void process(File file);
	}
	private Strategy strategy;
	private String regex;

	public ProcessFiles(Strategy strategy, String regex) {
		this.strategy = strategy;
		this.regex = regex;
	}

	public ProcessFiles() {
		super();
	}
	//如果这里 throw new RuntimeException则不会向上抛
	public void start(String[] args) throws IOException
	{
		if(args.length==0)
		{
			processDirectoryTrees(new File("."));
		}else {
			for (String s : args) {
				File file=new File(s);
				if(file.isDirectory())
				{
					processDirectoryTrees(file);
				}
				else {
					if(s.matches(regex))
					{
						processDirectoryTrees(new File(s).getCanonicalFile());
					}
				}
			}
		}
	}
	public void processDirectoryTrees(File root) throws IOException
	{
		for (File file :Directory.walk(root.getAbsolutePath(), regex)) {
			strategy.process(file.getCanonicalFile());
		}
	}
}

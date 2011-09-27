/**
 * Projet CHOUETTE
 *
 * ce projet est sous license libre
 * voir LICENSE.txt pour plus de details
 *
 */

package fr.certu.chouette.exchange.csv.importer.report;

import fr.certu.chouette.plugin.report.Report;
import fr.certu.chouette.plugin.report.ReportItem;


/**
 * @author michel
 *
 */
public class CSVReportItem extends ReportItem 
{
	public enum KEY {OK_LINE,FILE_ERROR,VALIDATION_ERROR,VALIDATION_CAUSE,FILE_IGNORED, PARSE_OBJECT, MANDATORY_TAG, UNKNOWN_ENUM, EMPTY_TAG, OBJECT_COUNT} ;

	/*
	public NeptuneReportItem(KEY key,String... args)
	{
       setMessageKey(key.name());
       addMessageArgs(args);
	}
	*/
	public CSVReportItem(KEY key,Report.STATE status, String... args)
	{
		setStatus(status);
        setMessageKey(key.name());
        addMessageArgs(args);
	}
	
	@Override
	public void addItem(ReportItem item) 
	{
		super.addItem(item);
		updateStatus(item.getStatus());
	}
	
	
}
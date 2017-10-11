package com.vote;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;

public class WikiMapper extends Mapper<LongWritable, Text,Text, LongWritable>
{  
    public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException
    {
        String Line= value.toString(); //for storing into string
        String a[]=Line.split(" ");   // for spli based on space
         output.write(new Text(a[2]+" "+a[4]), new LongWritable(1));        
        } 
     }

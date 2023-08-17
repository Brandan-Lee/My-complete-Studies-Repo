namespace _1.Class_and_Object
{
    partial class FrmEmployeeDetials
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnClose = new System.Windows.Forms.Button();
            this.lblEmployeePosition = new System.Windows.Forms.Label();
            this.lblEmployeeAge = new System.Windows.Forms.Label();
            this.lblEmployeeName = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnClose
            // 
            this.btnClose.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.btnClose.Location = new System.Drawing.Point(37, 152);
            this.btnClose.Name = "btnClose";
            this.btnClose.Size = new System.Drawing.Size(123, 46);
            this.btnClose.TabIndex = 6;
            this.btnClose.Text = "Close";
            this.btnClose.UseVisualStyleBackColor = true;
            this.btnClose.Click += new System.EventHandler(this.btnClose_Click);
            // 
            // lblEmployeePosition
            // 
            this.lblEmployeePosition.AutoSize = true;
            this.lblEmployeePosition.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.lblEmployeePosition.Location = new System.Drawing.Point(22, 108);
            this.lblEmployeePosition.Name = "lblEmployeePosition";
            this.lblEmployeePosition.Size = new System.Drawing.Size(156, 20);
            this.lblEmployeePosition.TabIndex = 3;
            this.lblEmployeePosition.Text = "Employee Position";
            // 
            // lblEmployeeAge
            // 
            this.lblEmployeeAge.AutoSize = true;
            this.lblEmployeeAge.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.lblEmployeeAge.Location = new System.Drawing.Point(22, 66);
            this.lblEmployeeAge.Name = "lblEmployeeAge";
            this.lblEmployeeAge.Size = new System.Drawing.Size(124, 20);
            this.lblEmployeeAge.TabIndex = 4;
            this.lblEmployeeAge.Text = "Employee Age";
            // 
            // lblEmployeeName
            // 
            this.lblEmployeeName.AutoSize = true;
            this.lblEmployeeName.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.lblEmployeeName.Location = new System.Drawing.Point(22, 27);
            this.lblEmployeeName.Name = "lblEmployeeName";
            this.lblEmployeeName.Size = new System.Drawing.Size(138, 20);
            this.lblEmployeeName.TabIndex = 5;
            this.lblEmployeeName.Text = "Employee Name";
            // 
            // FrmEmployeeDetials
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(239, 258);
            this.Controls.Add(this.btnClose);
            this.Controls.Add(this.lblEmployeePosition);
            this.Controls.Add(this.lblEmployeeAge);
            this.Controls.Add(this.lblEmployeeName);
            this.Name = "FrmEmployeeDetials";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "FrmEmployeeDetials";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        public System.Windows.Forms.Button btnClose;
        public System.Windows.Forms.Label lblEmployeePosition;
        public System.Windows.Forms.Label lblEmployeeAge;
        public System.Windows.Forms.Label lblEmployeeName;
    }
}